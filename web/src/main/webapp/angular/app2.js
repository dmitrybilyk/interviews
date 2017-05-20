var sampleApp = angular.module('sampleApp', []);

sampleApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/ShowOrder/:orderId', {
                templateUrl: 'templates/show_order.html',
                controller: 'ShowOrderController'
            });
    }]);


sampleApp.controller('ShowOrderController', function($scope, $routeParams) {

    $scope.order_id = $routeParams.orderId;

});

