/**
 * Created by USER on 9/14/2015.
 */
(function(){var admintbc= angular.module('admintbc',[]);

    admintbc.directive('navbar', function(){
        return{
            restrict:'E',
            templateUrl: 'partials/navbar.html',
            controllerAs:'navbar'
        };
    });

    admintbc.directive('users', function(){
        return {
            restrict:'E',
            templateUrl: 'partials/users.html',
            controller: 'getUsers'
        }
    });

    admintbc.directive('mobibuses', function(){
        return {
            restrict:'E',
            templateUrl: 'partials/mobibuses.html',
            controller: 'getMobibuses'
        }
    });

    admintbc.directive('vcubs', function(){
        return {
            restrict:'E',
            templateUrl: 'partials/vcubs.html',
            controller: 'getVcubs'
        }
    });

    admintbc.directive('tranvias', function(){
        return {
            restrict:'E',
            templateUrl: 'partials/tranvias.html',
            controller: 'getTranvias'
        }
    });

    admintbc.directive('conductores', function(){
        return {
            restrict:'E',
            templateUrl: 'partials/conductores.html',
            controller: 'getConductores'
        }
    });

    admintbc.directive('estaciones', function(){
        return {
            restrict:'E',
            templateUrl: 'partials/estaciones.html',
            controller: 'getEstaciones'
        }
    });

    admintbc.directive('trayectos', function(){
        return {
            restrict:'E',
            templateUrl: 'partials/trayectos.html',
            controller: 'getTrayectos'
        }
    });

    //=======================================================================================
    //==================================== Controllers ======================================
    //=======================================================================================

    admintbc.controller("getMobibuses", function($http, $scope) {
        $http.get('http://localhost:9000/mobibuses').
            success(function(data, status, headers, config) {
                $scope.competitors = data;
            }).
            error(function(data, status, headers, config) {
                // log error
            });
    });

    admintbc.controller("getTranvias", function($http, $scope) {
        $http.get('http://localhost:9000/tranvias').
            success(function(data, status, headers, config) {
                $scope.competitors = data;
            }).
            error(function(data, status, headers, config) {
                // log error
            });
    });

    admintbc.controller("getVcubs", function($http, $scope) {
        $http.get('http://localhost:9000/vcubs').
            success(function(data, status, headers, config) {
                $scope.vcubs = data;
            }).
            error(function(data, status, headers, config) {
                // log error
            });
    });

    admintbc.controller("getUsers", function($http, $scope) {
        $http.get('http://localhost:9000/usuarios').
            success(function(data, status, headers, config) {
                $scope.user = data;
            }).
            error(function(data, status, headers, config) {
                console.log("Da�o ac�");
            });
    });

    admintbc.controller("getConductores", function($http, $scope) {
        $http.get('http://localhost:9000/conductor').
            success(function(data, status, headers, config) {
                $scope.driver = data;
            }).
            error(function(data, status, headers, config) {
                console.log("Da�o ac�");
            });
    });

    admintbc.controller("getEstaciones", function($http, $scope) {
        $http.get('http://localhost:9000/estaciones').
            success(function(data, status, headers, config) {
                $scope.estacion = data;
            }).
            error(function(data, status, headers, config) {
                console.log("Da�o ac�");
            });
    });

    admintbc.controller("getTrayectos", function($http, $scope) {
        $http.get('http://localhost:9000/trayectos').
            success(function(data, status, headers, config) {
                $scope.trayecto = data;
            }).
            error(function(data, status, headers, config) {
                console.log("Da�o ac�");
            });
    });

    //=======================================================================================
    //===================================== Métodos =========================================
    //=======================================================================================

    admintbc.controller("driverCtrl", function($http, $scope, alertService){

        $scope.addDriver=function($http, $scope){
            $http.post('/conductor', JSON.stringify($scope.driver)).success(function(data, headers){
                $scope.driver={};
            });
        };

        $scope.addUser=function($http, $scope){
            $http.post('/usuarios', JSON.stringify($scope.driver)).success(function(data, headers){
                $scope.user={};
            });
        };

        scope.addTranvia=function($http, $scope){
             $http.post('/tranvias', JSON.stringify($scope.driver)).success(function(data, headers){
                    $scope.tranvia={};
             });
        };

        scope.addEstacion=function($http, $scope){
            $http.post('/estaciones', JSON.stringify($scope.driver)).success(function(data, headers){
                    $scope.estacion={};
            });
        };

        scope.addMobibus=function($http, $scope){
            $http.post('/mobibuses', JSON.stringify($scope.driver)).success(function(data, headers){
                    $scope.mobibus={};
            });
        };

        scope.addVcub=function($http, $scope){
            $http.post('/vcubs', JSON.stringify($scope.driver)).success(function(data, headers){
                    $scope.vcub={};
            });
        };

        scope.addTrayecto=function($http, $scope){
            $http.post('/trayectos', JSON.stringify($scope.driver)).success(function(data, headers){
                    $scope.trayecto={};
            });
        };
    });



})();

//=======================================================================================
//====================================== Modal ==========================================
//=======================================================================================

var mymodal = angular.module('mymodal', []);

mymodal.controller('MainCtrl', function ($scope) {
    $scope.showModal = false;
    $scope.toggleModal = function(){
        $scope.showModal = !$scope.showModal;
    };
});

mymodal.directive('modal', function () {
    return {
        template: '<div class="modal fade">' +
        '<div class="modal-dialog">' +
        '<div class="modal-content">' +
        '<div class="modal-header">' +
        '<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>' +
        '<h4 class="modal-title">{{ title }}</h4>' +
        '</div>' +
        '<div class="modal-body" ng-transclude></div>' +
        '</div>' +
        '</div>' +
        '</div>',
        restrict: 'E',
        transclude: true,
        replace:true,
        scope:true,
        link: function postLink(scope, element, attrs) {
            scope.title = attrs.title;

            scope.$watch(attrs.visible, function(value){
                if(value == true)
                    $(element).modal('show');
                else
                    $(element).modal('hide');
            });

            $(element).on('shown.bs.modal', function(){
                scope.$apply(function(){
                    scope.$parent[attrs.visible] = true;
                });
            });

            $(element).on('hidden.bs.modal', function(){
                scope.$apply(function(){
                    scope.$parent[attrs.visible] = false;
                });
            });
        }
    };
});