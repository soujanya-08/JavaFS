var HttpStatusCode;
(function (HttpStatusCode) {
    HttpStatusCode[HttpStatusCode["OK"] = 200] = "OK";
    HttpStatusCode[HttpStatusCode["NOTFOUND"] = 404] = "NOTFOUND";
    HttpStatusCode[HttpStatusCode["ACCESSDENIED"] = 403] = "ACCESSDENIED";
    HttpStatusCode[HttpStatusCode["INTERNALERROR"] = 500] = "INTERNALERROR";
})(HttpStatusCode || (HttpStatusCode = {}));
var okCode = HttpStatusCode.OK;
var notFound = HttpStatusCode.NOTFOUND;
console.log("OK", okCode);
console.log(notFound, "page not found");
console.log(HttpStatusCode.ACCESSDENIED, "Access denied");
console.log(HttpStatusCode.INTERNALERROR, "internal error");
