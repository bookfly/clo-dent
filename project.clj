(defproject clo-dent "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [ring-server "0.4.0"]
                 [org.clojure/java.jdbc "0.4.1"]]
  :ring {:handler clo-dent.core/handler}
  :main ^:skip-aot clo-dent.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
