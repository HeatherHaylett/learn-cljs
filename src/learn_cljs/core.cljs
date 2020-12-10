(ns learn-cljs.core)

;; add two numbers
(defn add-two [x y]
  (+ x y))

(add-two 1 1) ;;=> 2

;; subtract one number from another
(defn subtract-nums [x y]
  (- x y))

(subtract-nums 10 7) ;;=> 3

;; multiply operands
(defn multiply-nums [x y z]
  (* x y z))

(multiply-nums 2 2 4) ;;=> 16