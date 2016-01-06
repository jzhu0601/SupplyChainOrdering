/**
 * Created by Jason on 1/6/16.
 */
(function () {
    "use strict";

    angular.module("supplyOrderApp")
        .controller('registerEmployeeCtrl', function ($scope, $http) {
            $scope.registerEmployee = function () {
                var dataToSend = {
                    firstName: $scope.firstName,
                    lastName: $scope.lastName,
                    birthday: $scope.birthday,
                    address: $scope.address,
                    city: $scope.city,
                    region: $scope.region,
                    postalCode: $scope.postal_code,
                    country: $scope.country,
                    title: $scope.title,
                    titleOfCourtesy: $scope.title_of_courtesy,
                    photo: $scope.photo,
                    reportsTo: $scope.reports_to,
                    extension: $scope.extension,
                    hireDate: $scope.hire_date,
                    homePhone: $scope.home_phone,
                    notes: $scope.notes
                } //end dataToSend
                console.log(dataToSend);
                var res = $http.post('/api/employees', dataToSend)
                    .then(function (response) {
                        console.log(response);
                    });//end post
            }
        });

    //angular.module("supplyOrderApp")
    //    .controller('registerEmployeeCtrl', ['$scope', 'fileUpload', function ($scope, $http, fileUpload) {
    //
    //        $scope.registerEmployee = function () {
    //            var dataToSend = {
    //                firstName: $scope.firstName,
    //                lastName: $scope.lastName,
    //                birthday: $scope.birthday,
    //                address: $scope.address,
    //                city: $scope.city,
    //                region: $scope.region,
    //                postal_code: $scope.postal_code,
    //                country: $scope.country,
    //                title: $scope.title,
    //                title_of_courtesy: $scope.title_of_courtesy,
    //                reports_to: $scope.reports_to,
    //                extension: $scope.extension,
    //                hire_date: $scope.hire_date,
    //                home_phone: $scope.home_phone,
    //                notes: $scope.notes,
    //                photo:$scope.photo
    //            } //end dataToSend
    //
    //            $http.post('/api/employees', dataToSend)
    //                .then(function (response) {
    //                    console.log(response);
    //                });//end post
    //
    //        } //end registerEmployee
    //
    //        $scope.uploadFile = function () {
    //            var file = $scope.myFile;
    //            console.log(file);
    //            //var uploadUrl = "/fileUpload";
    //            //fileUpload.uploadFileToUrl(file, uploadUrl);
    //        }; //end uploadFile
    //
    //    }]); //end registerEmployeeCtrl

})();//end IFFE