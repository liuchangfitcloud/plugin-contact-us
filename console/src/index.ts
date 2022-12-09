import {definePlugin} from "@halo-dev/console-shared";
import DefaultView from "./views/DefaultView.vue";
import {IconMessage} from "@halo-dev/components";
import "./styles/index.css";
import {markRaw} from "vue";

export default definePlugin({
  name: "PluginContactUs",
  components: [],
  routes: [
    {
      parentName: "Root",
      route:
        {
          path: "/contact-us",
          children: [
            {
              path: "",
              name: "ContactUs",
              component: DefaultView,
              meta: {
                //permissions: ["plugin:contacts:view"],
                title: "ContactUs",
                searchable: true,
                menu: {
                  name: "联系我们",
                  group: "system",
                  icon: markRaw(IconMessage),
                  priority: 0,
                },
              },
            },
          ],
        },
    }
  ],
  extensionPoints: {},
  activated() {
  },
  deactivated() {
  },
});
