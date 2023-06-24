(ns app-name.core
  (:require [malli.core :as m]))

(m/=> start [:=> :cat :nil])
(defn start []
  (js/console.log "start"))

(m/=> stop [:=> :cat :nil])
(defn stop []
  ;; stop is called before any code is reloaded
  ;; this is controlled by :before-load in the config
  (js/console.log "stop"))

(m/=> init [:=> :cat :nil])
(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (start))
