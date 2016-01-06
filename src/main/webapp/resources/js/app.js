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

    //supplyOrderApp.directive('fileModel', ['$parse', function ($parse) {
    //    return {
    //        restrict: 'A',
    //        link: function (scope, element, attrs) {
    //            var model = $parse(attrs.fileModel);
    //            var modelSetter = model.assign;
    //
    //            element.bind('change', function () {
    //                scope.$apply(function () {
    //                    modelSetter(scope, element[0].files[0]);
    //                });
    //            });
    //        }
    //    };
    //}]);

    //supplyOrderApp.service('fileUpload', ['$http', function ($http) {
    //    this.uploadFileToUrl = function (file, uploadUrl) {
    //        var fd = new FormData();
    //        fd.append('file', file);
    //        $http.post(uploadUrl, fd, {
    //                transformRequest: angular.identity,
    //                headers: {'Content-Type': undefined}
    //            })
    //            .success(function () {
    //            })
    //            .error(function () {
    //            });
    //    }
    //}]);


})();//end IFFE
