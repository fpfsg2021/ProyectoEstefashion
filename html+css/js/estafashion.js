function marcaFavorito(evt){
    imagenCorazon = document.querySelector("#"+evt.target.id);
    //La primera vez que se selecciona se pone el atributo "favorito" a "false"
    if (imagenCorazon.getAttribute("favorito")==null) {
        imagenCorazon.setAttribute("favorito","false");
    }
    //Se cambian los valores
    if (imagenCorazon.getAttribute("favorito")=="false"){
        imagenCorazon.setAttribute("src","./images/heart_selected.png");
        imagenCorazon.setAttribute("favorito","true");
    } else {
        imagenCorazon.setAttribute("src","./images/heart.png");
        imagenCorazon.setAttribute("favorito","false");
    }  
}