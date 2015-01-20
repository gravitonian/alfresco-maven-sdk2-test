model.jsonModel = {
    widgets: [{
        id: "SET_PAGE_TITLE",
        name: "alfresco/header/SetTitle",
        config: {
            title: "This is a Hello World page! Great!"
        }
    },
    {
        id: "MY_HORIZONTAL_WIDGET_LAYOUT",
        name: "alfresco/layout/VerticalWidgets",
        config: {
            widgetWidth: 50,
            widgets: [
                {
                    name: "alfresco/logo/Logo",
                    config: {
                        logoClasses: "alfresco-logo-only"
                    }
                },
                {
                    name: "mycompanyWidgets/HelloWorldWidget"
                },
                {
                    name: "mycompanyWidgets/HelloWorldWidget2"
                }
            ]
        }
    }]
};