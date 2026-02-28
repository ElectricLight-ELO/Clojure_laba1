(ns clojure-laba1.core
  (:gen-class))
; вариант 5
(defn test
  "test function"
  [name]
  (str "Hello, " name " world")
  )

(defn greet [name] 
    (let [x 10
    b 2
    c (+ b x )] 
    
    (println c)
    )

    
    (str  name)
)

(defn -main
  "Main entry point for the application"
  [& args]
  (println "test Laba1")
  (println (test "Student"))
  
  (println(greet "tttest"))
  )
