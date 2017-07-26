package ajedrez;

//  Negro   ->  Arriba
//  Blanco  ->  Abajo

public class AdminAjedrez {
    private Tablero miTablero;
    
    private Ficha torreReynaNegro;
    private Ficha caballoReynaNegro;
    private Ficha alfilReynaNegro;
    private Ficha reynaNegro;
    private Ficha reyNegro;    
    private Ficha alfilReyNegro;    
    private Ficha caballoReyNegro;    
    private Ficha torreReyNegro;
    
    private Ficha peonTorreReynaNegro;
    private Ficha peonCaballoReynaNegro;
    private Ficha peonAlfilReynaNegro;
    private Ficha peonReynaNegro;
    private Ficha peonReyNegro;    
    private Ficha peonAlfilReyNegro;    
    private Ficha peonCaballoReyNegro;    
    private Ficha peonTorreReyNegro;
    
    private Ficha torreReynaBlanco;
    private Ficha caballoReynaBlanco;
    private Ficha alfilReynaBlanco;
    private Ficha reynaBlanco;
    private Ficha reyBlanco;    
    private Ficha alfilReyBlanco;    
    private Ficha caballoReyBlanco;    
    private Ficha torreReyBlanco;
    
    private Ficha peonTorreReynaBlanco;
    private Ficha peonCaballoReynaBlanco;
    private Ficha peonAlfilReynaBlanco;
    private Ficha peonReynaBlanco;
    private Ficha peonReyBlanco;    
    private Ficha peonAlfilReyBlanco;    
    private Ficha peonCaballoReyBlanco;    
    private Ficha peonTorreReyBlanco;
    
    
    public AdminAjedrez()
    {        
        miTablero = new Tablero((byte)8);
        
        torreReynaNegro = new Ficha(TipoF.TORRE, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)0);
        caballoReynaNegro = new Ficha(TipoF.CABALLO, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)1);
        alfilReynaNegro = new Ficha(TipoF.ALFIL, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)2);
        reynaNegro = new Ficha(TipoF.REYNA, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)3);
        reyNegro = new Ficha(TipoF.REY, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)4);    
        alfilReyNegro = new Ficha(TipoF.ALFIL, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)5);
        caballoReyNegro = new Ficha(TipoF.CABALLO, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)6);    
        torreReyNegro = new Ficha(TipoF.TORRE, ColorA.NEGRO, EstadoF.VIVO, (byte)0, (byte)7);
    
        peonTorreReynaNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)0);
        peonCaballoReynaNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)1);
        peonAlfilReynaNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)2);
        peonReynaNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)3);
        peonReyNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)4); 
        peonAlfilReyNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)5);
        peonCaballoReyNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)6);
        peonTorreReyNegro = new Ficha(TipoF.PEON, ColorA.NEGRO, EstadoF.VIVO, (byte)1, (byte)7);
    
        torreReynaBlanco = new Ficha(TipoF.TORRE, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)0);
        caballoReynaBlanco = new Ficha(TipoF.CABALLO, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)1);
        alfilReynaBlanco = new Ficha(TipoF.ALFIL, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)2);
        reynaBlanco = new Ficha(TipoF.REYNA, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)3);
        reyBlanco = new Ficha(TipoF.REY, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)4);  
        alfilReyBlanco = new Ficha(TipoF.ALFIL, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)5);
        caballoReyBlanco = new Ficha(TipoF.CABALLO, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)6);
        torreReyBlanco = new Ficha(TipoF.TORRE, ColorA.BLANCO, EstadoF.VIVO, (byte)7, (byte)7);
    
        peonTorreReynaBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)0);
        peonCaballoReynaBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)1);
        peonAlfilReynaBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)2);
        peonReynaBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)3);
        peonReyBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)4);
        peonAlfilReyBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)5);
        peonCaballoReyBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)6);
        peonTorreReyBlanco = new Ficha(TipoF.PEON, ColorA.BLANCO, EstadoF.VIVO, (byte)6, (byte)7);
        
    }
    
}
