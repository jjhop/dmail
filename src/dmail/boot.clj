(ns dmail.boot
  (:require [dmail.gui :as g])
  (:gen-class
     :name dmail.boot.Main))

(defn -main [& args]
  (print args)
  (println "It's a humble start to a great application!")
  (g/main-window))
