(ns {{name}}.server
  (:require [compojure.route :as route]
            [compojure.core :as compojure]
            [compojure.handler :as handler]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.resource :as resources]
            [ring.util.response :as response])
  (:use [hiccup.core])
  (:gen-class))

(defn render-app []
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body
       ((html [:ul
               (for [x (range 1 4)]
                 [:li x])]))})

(defn handler [request]
  (if (= "/" (:uri request))
      (response/redirect "/index.html")
      (render-app)))

(def app
  (-> handler
    (resources/wrap-resource "public")))

(defn -main [& args]
  (jetty/run-jetty app {:port 3000}))
