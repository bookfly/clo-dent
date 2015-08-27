(ns clo-dent.models.db
  (:require [clojure.java.jdbc :as sql])
  (:import java.sql.DriverManager))

 ;;https://en.wikibooks.org/wiki/Clojure_Programming/Examples/JDBC_Examples
(let [db-host "localhost"
      db-port 3306
      db-name "dent"]
 
  (def db {:classname "com.mysql.jdbc.Driver"
           :subprotocol "mysql"
           :subname (str "//" db-host ":" db-port "/" db-name)
           :user "root"
           :password ""}))
 
 ;;trial  
 (defn insert-dent []
   (sql/insert! db :dentist
  {:id 1 :first_name "John" :last_name "Smith" :licence_no 1234}
  {:id 2 :first_name "Pera" :last_name "Peric" :licence_no 2243}))
 
 
