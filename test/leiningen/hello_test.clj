(ns leiningen.hello-test
  (:use midje.sweet) 
  (:require [leiningen.hello :as say]))

(def ^:private project {:hello {:name "Noah"}})

(facts "about this plugin"
 (with-out-str (say/hello project)) => "Hello Noah!\n"
 (with-out-str (say/hello project "Phil")) => "Hello Phil!\n"
 (with-out-str (say/hello {})) => "Hello there!\n")
