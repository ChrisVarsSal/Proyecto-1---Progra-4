


function validateForm() {
    let x1 = document.forms["form"]["1email"].value;
    let x2 = document.forms["form"]["1telefono"].value;
    let x3 = document.forms["form"]["1miembro"].value;
    var Vtele = /^[0-9]{8}$/;
    var Vemail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var Vid = /^([0-9]{2})-([0-9]{2})-([0-9]{2})$/;
    var teleValid = Vtele.test(x2);
    var emailValid = Vemail.test(x1);
    var idValid = Vid.test(x3);
    if (emailValid == false ) {
        alert("Digite un email valido!");
        return false;
    }
    if (teleValid == false ) {
        alert("Digite un telefono valido!");
        return false;
    }
    if (idValid == false && x3 !=""  ) {
        alert("Digite un id de miembro en formato XX-XX-XX!");
        return false;
    }
}

var boton = document.getElementById("backToTop");

window.onscroll = function() {scrollFunction()};

function scrollFunction(){
    if(document.body.scrollTop > 200 || document.documentElement.scrollTop > 200){
        boton.style.display = "block";
    }else{
        boton.style.display = "none";
    }
}

// form.addEventListener("submit", e=>{
//     e.preventDefault()
//     parrafo.innerHTML = ""
//     let warnigs = ""
//     let entrar = false
//     let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
//     let regexTele = /^[0-9]{8}$/
//     let regexMiembro = /^.*([0-9]{2})-([0-9]{2})-([0-9]{2})$/
//
//     if(!regexEmail.test(email.value) ){
//         warnigs += 'Ingrese un email valido.<br>'
//         entrar = true
//     }
//
//     if(!regexTele.test(tele.value) ){
//         warnigs += 'Ingrese un telefono valido.<br>'
//         entrar = true
//     }
//
//     if(!regexMiembro.test(miembro.value) ){
//         warnigs += 'Ingrese un clave valida, en caso contrario digite 00-00-00.<br>'
//         entrar = true
//     }
//
//
//     if(entrar){
//         parrafo.innerHTML = warnigs
//     }else{
//         parrafo.innerHTML = "Sus datos han sido enviados"
//         alert("¡Se a validado su informacion!");
//
//     }
//
// });

// function validarEmail(email){
//     valor = email.value;
//     if(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(valor)){
//         return true;
//     }
//     alert("Ingrese un email valido.");
//     return false;
// }
//
// function validarTelefono(telefono){
//     valor = telefono.value;
//     if(/^[0-9]{8}$/.test(valor)){
//         return true;
//     }
//     alert("Ingrese un telefono valido.");
//     return false;
// }
//
// function validarMiembro(miembro){
//     valor = miembro.value;
//     if(/^([0-9]{2})-([0-9]{2})-([0-9]{2})$/.test(valor) || valor.length == 0){
//         return true;
//     }
//     alert("Ingrese un ID de miembro valido, con el formato XX-XX-XX, en caso de no tenerlo deje el espacio en blanco.");
//     return false;
// }
//
// function validarTodo(){
//     if(!validarEmail(document.getElementById("email")) && !validarTelefono(document.getElementById("telefono"))
//         && !validarMiembro(document.getElementById("miembro"))){
//         return false;
//     }
//     return true;
// }

// function validateForm() {
//     let x1 = document.forms["form"]["1email"].value;
//     let x2 = document.forms["form"]["1telefono"].value;
//     let x3 = document.forms["form"]["1miembro"].value;
//     var correo = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
//     var cel = /^[0-9]{8}$/;
//     var
//
//     if (x1 == /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/ ) {
//         alert("Digite un email valido!");
//         return false;
//     }
//     if (x2 == /^[0-9]{8}$/ ) {
//         alert("Digite un telefono valido!");
//         return false;
//     }
//     if (x3 == /^([0-9]{2})-([0-9]{2})-([0-9]{2})$/ ) {
//         alert("Digite un id de miembro en formato XX-XX-XX!");
//         return false;
//     }
// }

function validateForm() {
    let x1 = document.forms["form"]["1email"].value;
    let x2 = document.forms["form"]["1telefono"].value;
    let x3 = document.forms["form"]["1miembro"].value;

    var regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var regexTele = /^[0-9]{8}$/;
    var regexMiembro = /^.*([0-9]{2})-([0-9]{2})-([0-9]{2})$/;

    var numberR = regexTele.test(x2);
    var correoR = regexEmail.test(correo);
    var idR = regexMiembro.test(id);

    if (x1 == correoR ) {
        alert("Digite un email valido!");
        return false;
    }
    if (numberR == false) {
        alert("Digite un telefono valido!");
        return false;
    }
    if (x3 == idR ) {
        alert("Digite un id de miembro en formato XX-XX-XX!");
        return false;
    }
}

// function validateForm(){
//     var number = document.getElementById('1telefono').value;
//     var correo = document.getElementById('1email').value;
//     var id  =  document.getElementById('1miembro').value;
//     var regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
//     var regexTele = /^[0-9]{8}$/;
//     var regexMiembro = /^.*([0-9]{2})-([0-9]{2})-([0-9]{2})$/;
//
//     var numberR = regexTele.test(number);
//     var correoR = regexEmail.test(correo);
//     var idR = regexMiembro.test(id);
//
//
//     if(numberR == false)
//     {
//         alert('Please enter a valid phone number');
//         return false;
//     }
//
//     if(correoR == false)
//     {
//         alert('Please enter a valid email');
//         return false;
//     }
//
//     if(idR == false)
//     {
//         alert('Please enter a valid XX-XX-XX');
//         return false;
//     }
//
//     return true;
// }

// Este funciona
// function validateForm() {
//     let x1 = document.forms["form"]["1email"].value;
//     let x2 = document.forms["form"]["1telefono"].value;
//     let x3 = document.forms["form"]["1miembro"].value;
//     if (x1 == /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/ ) {
//         alert("Digite un email valido!");
//         return false;
//     }
//     if (x2 == "1" ) {
//         alert("Digite un telefono valido!");
//         return false;
//     }
//     if (x3 == /^([0-9]{2})-([0-9]{2})-([0-9]{2})$/ ) {
//         alert("Digite un id de miembro en formato XX-XX-XX!");
//         return false;
//     }
// }


