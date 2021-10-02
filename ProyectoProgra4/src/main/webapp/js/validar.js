const form = document.getElementById("form");
const parrafo = document.getElementById("warnings");
const email = document.getElementById("email");
const tele = document.getElementById("telefono");
const miembro = document.getElementById("miembro");

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
    if(entrar){
        parrafo.innerHTML = warnigs
    }else{
        parrafo.innerHTML = "Sus datos han sido enviados"
        alert("¡Se a validado su informacion!");
    }

});
