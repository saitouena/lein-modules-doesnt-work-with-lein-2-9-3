(ns b.core
  (:require [a.core :as a]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
(a/foo)
