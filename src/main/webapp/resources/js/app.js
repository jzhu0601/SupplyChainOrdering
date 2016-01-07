/**
 * Created by Jason on 1/6/16.
 */
(function () {
    "use strict";
    var supplyOrderApp = angular.module('supplyOrderApp', ['ngRoute']);

    supplyOrderApp.config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: '/resources/fragment/home.html',
                controller: 'homeCtrl',
                caseInsensitiveMatch: true
            })

            .when('/registerEmployee', {
                templateUrl: '/resources/fragment/registerEmployee.html',
                controller: 'registerEmployeeCtrl',
                caseInsensitiveMatch: true
            })
    });//end config

    supplyOrderApp.directive('fileModel', ['$parse', function ($parse) {
        return {
            restrict: 'A',
            link: function (scope, element, attrs) {
                var model = $parse(attrs.fileModel);
                var modelSetter = model.assign;

                element.bind('change', function () {
                    scope.$apply(function () {
                        modelSetter(scope, element[0].files[0]);
                    })
                })
            }
        }
    }]);

    supplyOrderApp.service('multipartForm', ['$http', function ($http) {
        this.post = function (uploadUrl, data) {
            var fd = new FormData();
            for (var key in data)
                fd.append(key, data[key]);
            $http.post(uploadUrl, fd, {
                transformRequest: angular.indentity,
                headers: {'Content-Type': undefined}
            });
        }
    }]);


})();//end IFFE
