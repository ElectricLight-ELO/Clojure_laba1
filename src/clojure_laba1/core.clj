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
; --------------------
(def users   ; глобальная переменная под имена
  [ {:name "Иван"   :age 20}
   {:name "Мария"  :age 25}
   {:name "Петр"   :age 20}
   {:name "Анна"   :age 30}
   {:name "Олег"   :age 25}
   {:name "Света"  :age 30}
   {:name "Вася"  :age 30}
   {:name "Таня"  :age 31}
   ]  )

(defn group_by_age [users]
  (group-by :age users)

(defn -main
  "laboratorka var5"
  [& args]
    (println "--- Группировка по возрасту---")
  
  (let 
      [grouped (group_by_age users)]
        (doseq [[group] grouped]
          (println (map :name group)) ; группировка
        )
      )

 ; (println "test Laba1")
 ; (println (test "Student"))
 ; (println(greet "tttest"))
  )
