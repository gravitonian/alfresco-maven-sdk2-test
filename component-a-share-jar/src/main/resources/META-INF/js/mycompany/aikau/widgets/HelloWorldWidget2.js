define(["dojo/_base/declare",
        "dijit/_WidgetBase",
        "alfresco/core/Core",
        "dijit/_TemplatedMixin",
        "dojo/text!./HelloWorldWidget2.html"
    ],
    function(declare, _Widget, Core, _Templated, template) {
        return declare([_Widget, Core, _Templated], {
            templateString: template,
            i18nRequirements: [ {i18nFile: "./HelloWorldWidget2.properties"} ],
            cssRequirements: [{cssFile:"./HelloWorldWidget2.css"}],

            buildRendering: function mycompany_widgets_HelloWorldWidget2__buildRendering() {
                this.greeting2 = this.message('helloworld.label2');
                this.inherited(arguments);
            }
        });
});