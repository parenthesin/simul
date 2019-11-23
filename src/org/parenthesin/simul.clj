(ns org.parenthesin.simul
  (:require [config.core :refer [env]])
  (:gen-class))

(defn -main []
  (println (:unsplash-access-key env)))
