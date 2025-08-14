enum HttpStatusCode{
    OK=200,
    NOTFOUND=404,
    ACCESSDENIED =403,
    INTERNALERROR = 500
}
let okCode = HttpStatusCode.OK;
let notFound = HttpStatusCode.NOTFOUND;

console.log("OK", okCode);
console.log(notFound, "page not found");
console.log(HttpStatusCode.ACCESSDENIED, "Access denied");
console.log(HttpStatusCode.INTERNALERROR, "internal error");