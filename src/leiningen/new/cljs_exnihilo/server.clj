(ns {{name}}.server
  (:require
            [compojure.handler]
            [compojure.route :as route]
            [compojure.core :as compojure]
            [ring.adapter.jetty :as jetty]
            [ring.util.response :as response])
  (:use [hiccup.core])
  ;(:gen-class)
  )

(compojure/defroutes main-routes
  (compojure/GET "/" request
                 (response/resource-response "public/index.html"))
  (route/resources "/"))

(def handler (compojure.handler/api main-routes))

(defn -main []
  (jetty/run-jetty main-routes {:join? true :port 3000}))
