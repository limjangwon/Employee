/**
 * @author java
 */
app.config(function($routeProvider) {
		console.log("route config...")
		
		$routeProvider.when("/detail/:id", {
			templateUrl: "detail.html",
			controller: "detailController"
		});
		
	});

app.controller('detailController', function($scope, $http, URL, $routeParams) {
	console.log("detailController...");
	console.log("URL.GET_PAGE_BASE=" + URL.GET_PAGE_BASE);
	
	$scope.$parent.title = "회원정보";
	
	var ajax = $http.get(URL.GET_ITEM_BASE + $routeParams.id);
	ajax.then(function(value) {
		console.dir(value);
		$scope.city = value.data;
	}, function(reason) {
		console.dir(reason);
		alert("error...");
	});
});