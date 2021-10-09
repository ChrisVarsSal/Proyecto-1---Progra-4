const form = document.getElementById("form");
const parrafo = document.getElementById("warnings");
const email = document.getElementById("email");
const tele = document.getElementById("telefono");
const miembro = document.getElementById("miembro");
var form = document.getElementById("form")

form.addEventListener("submit", e=>{
    e.preventDefault()
    parrafo.innerHTML = ""
    let warnigs = ""
    let entrar = false
    let regexEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
    let regexTele = /^[0-9]{8}$/
    let regexMiembro = /^.*([0-9]{2})-([0-9]{2})-([0-9]{2})$/

    if(!regexEmail.test(email.value) ){
        warnigs += 'Ingrese un email valido.<br>'
        entrar = true
    }

    if(!regexTele.test(tele.value) ){
        warnigs += 'Ingrese un telefono valido.<br>'
        entrar = true
    }

    if(!regexMiembro.test(miembro.value) ){
        warnigs += 'Ingrese un clave valida, en caso contrario digite 00-00-00.<br>'
        entrar = true
    }

    // var rcres = grecaptcha.getResponse();
    // if(rcres.length){
    //     grecaptcha.reset();
    //     showHideMsg("Form Submitted!","success");
    // }else{
    //     showHideMsg("Please verify reCAPTCHA","error");
    // }


    if(entrar){
        parrafo.innerHTML = warnigs
    }else{
        parrafo.innerHTML = "Sus datos han sido enviados"
        alert("¡Se a validado su informacion!");

    }

});



// $('form').submit(function(event) {
//     console.log('form submitted.');
//
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
//     if (!grecaptcha.getResponse()) {
//         console.log('captcha not yet completed.');
//
//         event.preventDefault(); //prevent form submit
//         grecaptcha.execute();
//     } else {
//         console.log('form really submitted.');
//     }
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
//
// onCompleted = function() {
//     console.log('captcha completed.');
//     $('form').submit();
//     alert('wait to check for "captcha completed" in the console.');
// }

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
//     if(entrar){
//         parrafo.innerHTML = warnigs
//     }else{
//         parrafo.innerHTML = "Sus datos han sido enviados"
//         alert("¡Se a validado su informacion!");
//
//     }
//     console.log('form submitted.');
//     if (!grecaptcha.getResponse()) {
//         console.log('captcha not yet completed.');
//         event.preventDefault(); //prevent form submit
//         grecaptcha.execute();
//     } else {
//         console.log('form really submitted.');
//     }
//
// });
//
// onCompleted = function() {
//     console.log('captcha completed.');
//     form.submit();
//     document.getElementById("message-success").style.display = "flex"
// }

