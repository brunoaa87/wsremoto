function carregarusuario(){
    var usuariostr = localStorage.getItem("usuariologado");
    // JAVA --> Objeto
    //JavaScript --> JSON
    //HTML --> Strig
    if(usuariostr!=null){
        var usuariojson = JSON.parse(usuariostr);
        document.getElementById("dados").innerHTML =
            "<h3>" + usuariojson.nome + " (" + usuariojson.racf + ")" + "<br>"+
            usuariojson.email + "</h3>";
    }

}


function logar(){
    
    //Primeiro: Definir se é GET ou POST
    var carta = {
        email : document.getElementById("txtemail").value,
        racf : document.getElementById("txtemail").value,
        senha : document.getElementById("txtsenha").value
    }

    var envelope = {
        method : "POST",
        body : JSON.stringify(carta),
        headers : {
            "content-type" : "application/json"
        }
    }
    //Fetch tem a estrututa do AJAX
    // ELe executa 2x THEM, e por final o CAtch se der certo ou não, existem casos que só usam then 1x

    //primeiro THEN -> converte a resposta do backend para Json
    //segundo THEN --> se der certo a resposta ele trás a respodta do html 200/404

    fetch("http://localhost:8080/login", envelope)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("usuariologado", JSON.stringify(res));
            window.location="usuario.html";
        })
        .catch(err => {
            window.alert("Não foi possível logar");
        });

}