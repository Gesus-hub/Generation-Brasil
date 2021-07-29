let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false

nome.style.width = '100%'
email.style.width = '100%'

function validaNome() {
    let txtNome = document.querySelector('#txtNome')
    if (nome.value.length < 3) {
        txtNome.innerHTML = 'Nome invalido'
        txtNome.style.color = 'red'
    } else {
        txtNome.innerHTML = 'Nome valido'
        txtNome.style.color='green'
        let nomeOk = true
}
}

// function validaEmail(){
//     let txt = document.querySelector('#txtEmail')

//     if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){
//         txtEmail.innerHTML = 'E-mail invalido'
//         txtEmail.style.color = 'red'
//         let emailOk = false
//     } else {
//         txtEmail.innerHTML = 'E-mail valido'
//         txtEmail.style.color = 'green'    
//         let emailOk = true
//     }
// }

function validaEmail() {
    /* Caso exista esse elemento dentro da abilidade ele irá retornar -1 
      é mais usado para validar o email.*/

      let txt = document.querySelector('#txtEmail')

    if (
      email.value.indexOf('@') == -1 ||
      email.value.indexOf('.') == -1
    ) {
      txtEmail.innerHTML = 'Invalido'
      txtEmail.style.color = 'red'
      let emailOk = false
    } else {
      txtEmail.innerHTML = 'Valido'
      txtEmail.style.color = 'green'
      let emailOk = true
    }
  }

function enviar (){
    if(nomeOk == true && emailOk == true){
        alert('Formulario enviado com sucesso!')

    }else{
        alert('Preencha o formulario corretamente antes de enviar!')
    }
}