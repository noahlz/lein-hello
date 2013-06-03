(ns leiningen.hello
  "Prints a friendly greeting!
   
   Usage:
   lein hello [name]
  
   You can also specify a name in your project.clj with:
  
   :hello {:name \"Phil\"}")

(defn- say-hello [name]
  (println (str "Hello " name "!")))

(defn hello
  ([project]
    (say-hello (if-let [user (get-in project [:hello :name])]
                 user
                 "there")))
  ([project name]
   (say-hello name)))
