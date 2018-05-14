(ns rmv.views
  (:require [rmv.db :as db]
            [rmv.locales :refer [t]]
            [rmv.styles :as styles]
            [rmv.subs]
            [re-frame.core :as re-frame]))

(defn main-panel
  []
  [:div "Hello from re-frame"])
