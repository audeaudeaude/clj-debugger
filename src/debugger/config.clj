(ns debugger.config
  (:require [debugger.time :as t]))

(declare ^:dynamic *locals*)
(def ^:dynamic *break-outside-repl* true)
(def ^:dynamic *code-context-lines* 5)
(def ^:dynamic *locals-print-length* 10)
(def ^:dynamic *skip-repl-if-last-quit-ago* 2)
(def ^:dynamic *last-quit-at* (atom (t/minus (t/now) (t/seconds *skip-repl-if-last-quit-ago*))))

