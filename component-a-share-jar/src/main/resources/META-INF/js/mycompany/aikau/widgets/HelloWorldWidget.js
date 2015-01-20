define(["dojo/_base/declare",
        "dijit/_WidgetBase",
        "alfresco/core/Core",
        "dijit/_TemplatedMixin",
        "dojo/text!./HelloWorldWidget.html"
    ],
    function(declare, _Widget, Core, _Templated, template) {
        return declare([_Widget, Core, _Templated], {
            templateString: template,
            i18nRequirements: [ {i18nFile: "./HelloWorldWidget.properties"} ],
            cssRequirements: [{cssFile:"./HelloWorldWidget.css"}],

            buildRendering: function mycompany_widgets_HelloWorldWidget__buildRendering() {
                this.greeting = this.message('helloworld.label');
                this.inherited(arguments);
            }
        });
});