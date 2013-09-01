(ns leiningen.new.cljs-exnihilo
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]
        [leinjacker.utils :only [lein-generation]]))

 (def render (renderer "cljs-exnihilo"))

(defn cljs-exnihilo
  "Create a new ClojureScript project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (println "Generating a new ClojureScript project ex nihilo:" (str name "..."))
    (->files data
             ["project.clj" (render "project.cljs" data)]
             ["README.md"   (render "README.md")]
             ["src/clj/{{sanitized}}/server.clj"      (render "server.clj" data)]
             ["src/{{sanitized}}/server.clj"       (render "client.clj" data)]
             ["resources/public/css/style.css" (render "screen.css" data)]
             ["resources/public/css/style.scss" (render "screen.scss" data)]
             ["resources/public/index.html" (render "index.html" data)]
             ["resources/public/js"]
             ["resources/public/img"])))
