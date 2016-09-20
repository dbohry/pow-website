powApp.controller('homeController', function($scope, $http) {

    $scope.rank = [];

    $http({
      method: 'GET',
      url: '/rank?numero=10'
    }).then(function successCallback(response) {
        $scope.rank = response.data;
      }, function errorCallback(response) {
      });

});