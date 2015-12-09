/**
 * @author java
 */
app.config(function($routeProvider) {
		console.log("route config...")
		
		$routeProvider.when("/detail", {
			templateUrl: "detail.html",
			controller: "detailController"
		});
		
	});

app.controller('detailController', function($scope, $http, URL) {
	console.log("detailController...");
	console.log("URL.GET_PAGE_BASE=" + URL.GET_PAGE_BASE);
	
	$scope.$parent.title = "Detail City View";
	
});