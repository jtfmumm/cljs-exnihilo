(ns {{name}}.cs
      (:use [jayq.core :only [$]])
    (:require [jayq.core :as jq]))

(def $colorchange ($ :#colorchange))

(defn addstuff []
      (jq/css $colorchange {:color "blue"}))

(jq/bind ($ :#colorchange) :click addstuff)

(jq/bind ($ :#clickhere) :click (fn [evt] (js/alert "Clicked!!")))
