/**
 * Created by Jason on 1/6/16.
 */
(function () {
    "use strict";
    angular.module("supplyOrderApp")
        .controller('registerEmployeeCtrl', ['$scope', 'multipartForm', function ($scope, multipartForm) {
            $scope.employee = {};
            $scope.registerEmployee = function () {
                console.log($scope.employee);
                //var uploadUrl = '/api/employees';
                //multipartForm.post(uploadUrl, $scope.employee);
            }
        }]);

})();//end IFFE