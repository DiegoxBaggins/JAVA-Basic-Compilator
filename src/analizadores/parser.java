
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import compi1.lenguaje.olc.*;
import Objetos.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\043\000\002\002\004\000\002\002\007\000\002\003" +
    "\004\000\002\003\004\000\002\003\003\000\002\003\003" +
    "\000\002\003\004\000\002\004\011\000\002\007\004\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\006\004\000\002\006\004\000\002\006" +
    "\003\000\002\006\003\000\002\006\004\000\002\013\007" +
    "\000\002\012\005\000\002\012\005\000\002\012\004\000" +
    "\002\012\004\000\002\012\004\000\002\012\003\000\002" +
    "\012\004\000\002\012\004\000\002\012\004\000\002\012" +
    "\005\000\002\012\003\000\002\010\006\000\002\005\004" +
    "\000\002\005\003\000\002\005\004\000\002\011\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\004\004\004\001\002\000\010\003\007\020" +
    "\014\026\013\001\002\000\004\002\006\001\002\000\004" +
    "\002\001\001\002\000\004\007\111\001\002\000\010\020" +
    "\ufffc\023\ufffc\026\ufffc\001\002\000\010\020\014\023\072" +
    "\026\013\001\002\000\010\020\ufffd\023\ufffd\026\ufffd\001" +
    "\002\000\004\021\037\001\002\000\004\006\015\001\002" +
    "\000\004\026\016\001\002\000\004\021\017\001\002\000" +
    "\004\022\020\001\002\000\014\025\025\027\022\030\024" +
    "\031\026\033\023\001\002\000\004\007\036\001\002\000" +
    "\004\007\ufff6\001\002\000\004\007\ufff5\001\002\000\004" +
    "\007\ufff8\001\002\000\010\003\027\011\031\025\032\001" +
    "\002\000\004\007\ufff7\001\002\000\004\007\035\001\002" +
    "\000\010\007\ufff9\011\033\025\034\001\002\000\010\007" +
    "\ufff1\011\ufff1\025\ufff1\001\002\000\010\007\ufff2\011\ufff2" +
    "\025\ufff2\001\002\000\010\007\ufff3\011\ufff3\025\ufff3\001" +
    "\002\000\010\007\ufff4\011\ufff4\025\ufff4\001\002\000\010" +
    "\007\ufff0\011\ufff0\025\ufff0\001\002\000\010\020\ufffa\023" +
    "\ufffa\026\ufffa\001\002\000\004\022\040\001\002\000\024" +
    "\003\045\004\050\010\044\012\047\013\041\016\052\017" +
    "\046\024\043\032\042\001\002\000\024\003\045\004\050" +
    "\010\044\012\047\013\041\016\052\017\046\024\043\032" +
    "\042\001\002\000\026\003\uffe9\004\uffe9\007\uffe9\010\uffe9" +
    "\012\uffe9\013\uffe9\016\uffe9\017\uffe9\024\uffe9\032\uffe9\001" +
    "\002\000\010\014\063\015\065\025\064\001\002\000\024" +
    "\003\045\004\050\010\044\012\047\013\041\016\052\017" +
    "\046\024\043\032\042\001\002\000\026\003\uffe4\004\uffe4" +
    "\007\uffe4\010\uffe4\012\uffe4\013\uffe4\016\uffe4\017\uffe4\024" +
    "\uffe4\032\uffe4\001\002\000\024\003\045\004\050\010\044" +
    "\012\047\013\041\016\052\017\046\024\043\032\042\001" +
    "\002\000\024\003\045\004\050\010\044\012\047\013\041" +
    "\016\052\017\046\024\043\032\042\001\002\000\004\026" +
    "\055\001\002\000\004\007\054\001\002\000\024\003\045" +
    "\004\050\010\044\012\047\013\041\016\052\017\046\024" +
    "\043\032\042\001\002\000\026\003\uffeb\004\uffeb\007\uffeb" +
    "\010\uffeb\012\uffeb\013\uffeb\016\uffeb\017\uffeb\024\uffeb\032" +
    "\uffeb\001\002\000\010\020\uffef\023\uffef\026\uffef\001\002" +
    "\000\004\005\056\001\002\000\026\003\uffe5\004\uffe5\007" +
    "\uffe5\010\uffe5\012\uffe5\013\uffe5\016\uffe5\017\uffe5\024\uffe5" +
    "\032\uffe5\001\002\000\026\003\uffec\004\uffec\007\uffec\010" +
    "\uffec\012\uffec\013\uffec\016\uffec\017\uffec\024\uffec\032\uffec" +
    "\001\002\000\026\003\uffea\004\uffea\007\uffea\010\uffea\012" +
    "\uffea\013\uffea\016\uffea\017\uffea\024\uffea\032\uffea\001\002" +
    "\000\024\003\045\004\050\010\044\012\047\013\041\016" +
    "\052\017\046\024\043\032\042\001\002\000\026\003\uffee" +
    "\004\uffee\007\uffee\010\uffee\012\uffee\013\uffee\016\uffee\017" +
    "\uffee\024\uffee\032\uffee\001\002\000\026\003\uffe7\004\uffe7" +
    "\007\uffe7\010\uffe7\012\uffe7\013\uffe7\016\uffe7\017\uffe7\024" +
    "\uffe7\032\uffe7\001\002\000\026\003\uffe6\004\uffe6\007\uffe6" +
    "\010\uffe6\012\uffe6\013\uffe6\016\uffe6\017\uffe6\024\uffe6\032" +
    "\uffe6\001\002\000\026\003\uffe8\004\uffe8\007\uffe8\010\uffe8" +
    "\012\uffe8\013\uffe8\016\uffe8\017\uffe8\024\uffe8\032\uffe8\001" +
    "\002\000\024\003\045\004\050\010\044\012\047\013\041" +
    "\016\052\017\046\024\043\032\042\001\002\000\026\003" +
    "\uffed\004\uffed\007\uffed\010\uffed\012\uffed\013\uffed\016\uffed" +
    "\017\uffed\024\uffed\032\uffed\001\002\000\010\020\ufffe\023" +
    "\ufffe\026\ufffe\001\002\000\006\003\077\026\101\001\002" +
    "\000\004\023\074\001\002\000\010\020\uffff\023\uffff\026" +
    "\uffff\001\002\000\004\023\075\001\002\000\004\023\076" +
    "\001\002\000\006\003\uffe3\026\uffe3\001\002\000\004\007" +
    "\110\001\002\000\006\005\uffe1\026\uffe1\001\002\000\004" +
    "\006\105\001\002\000\006\005\104\026\101\001\002\000" +
    "\006\005\uffe2\026\uffe2\001\002\000\004\002\000\001\002" +
    "\000\004\032\106\001\002\000\004\007\107\001\002\000" +
    "\006\005\uffdf\026\uffdf\001\002\000\006\005\uffe0\026\uffe0" +
    "\001\002\000\010\020\ufffb\023\ufffb\026\ufffb\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\107\000\004\002\004\001\001\000\010\003\010\004" +
    "\011\013\007\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\004\072\010" +
    "\070\013\067\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\020\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\027\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\050\001\001\000" +
    "\004\012\065\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\060\001\001\000\002\001\001\000\004\012" +
    "\057\001\001\000\004\012\056\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\052\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\061\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\012\066\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\005\101\011\077\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\011\102\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    //Codigo que se le agrega al parser

    public String Consola = "";

    public ArrayList<Expresion> expresiones = new ArrayList<Expresion>();
    public int contador;
    public int hoja = 1;

    //Codigo para Errores Sintacticos
    public void syntax_error(Symbol s){ 
        System.out.println("Error SintÃ¡ctico en la LÃ­nea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+".");
        Errors nuevoError = new Errors("Tipo Sintactico (Recuperado)", s.value.toString(), s.right+1, s.left+1);
        Compi1LenguajeOLC.Errores.add(nuevoError); 
    } 

    //Codigo para errores que ya no se pueden recuperar
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error sÃ­ntactico irrecuperable en la LÃ­nea " + 
        (s.left)+ " Columna "+s.right+". Componente " + s.value + 
        " no reconocido."); 
        Errors nuevoError = new Errors("Tipo Sintactico (No Recuperado)", s.value.toString(), s.right+1, s.left+1);
        Compi1LenguajeOLC.Errores.add(nuevoError);
    }  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= llave1 CABEZA SEPARAR CUERPO llave2 
            {
              Object RESULT =null;
		Consola += "aceptada";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CABEZA ::= CABEZA CONJUNTO 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CABEZA ::= CABEZA CONJUNTOEXP 
            {
              Object RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion var1 = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		expresiones.add(var1);hoja = 1; contador = 0;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CABEZA ::= CONJUNTO 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CABEZA ::= CONJUNTOEXP 
            {
              Object RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion var1 = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		expresiones.add(var1);hoja = 1; contador = 0;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CABEZA ::= error puntocoma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CABEZA",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CONJUNTO ::= conj dospuntos id guion mayorq CUERPOCONJUNTOS puntocoma 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONJUNTO",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CUERPOCONJUNTOS ::= palabra ELEMENTOS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CUERPOCONJUNTOS ::= casomin 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CUERPOCONJUNTOS ::= casomayus 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CUERPOCONJUNTOS ::= casonum 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CUERPOCONJUNTOS ::= casosim 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPOCONJUNTOS",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // ELEMENTOS ::= ELEMENTOS palabra 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // ELEMENTOS ::= ELEMENTOS coma 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // ELEMENTOS ::= palabra 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // ELEMENTOS ::= coma 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ELEMENTOS ::= error puntocoma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOS",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CONJUNTOEXP ::= id guion mayorq EXPRESION puntocoma 
            {
              Expresion RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo var2 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new Expresion(var2, var1, contador, hoja);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CONJUNTOEXP",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPRESION ::= punto EXPRESION EXPRESION 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo var1 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var2 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var1, var2, ".", parser.contador, 0); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXPRESION ::= barra EXPRESION EXPRESION 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Nodo var1 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var2 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var1, var2, "|", parser.contador, 0); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // EXPRESION ::= asterisco EXPRESION 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var1 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var1, null, "*", parser.contador, 0); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EXPRESION ::= mas EXPRESION 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var1 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var1, null, "+", parser.contador, 0); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EXPRESION ::= interrogacion EXPRESION 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Nodo var1 = (Nodo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(var1, null, "?", parser.contador, 0); parser.contador++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // EXPRESION ::= cadena 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(null, null, var1.substring(1,var1.length()-1), parser.contador,parser.hoja); parser.contador++; parser.hoja++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // EXPRESION ::= invertida comilla 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(null, null, var1, parser.contador, parser.hoja); parser.contador++; parser.hoja++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // EXPRESION ::= invertida comillas 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(null, null, var1+var2, parser.contador, parser.hoja); parser.contador++; parser.hoja++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // EXPRESION ::= invertida palabra 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int var2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int var2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String var2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT=new Nodo(null, null, var1+var1+var2, parser.contador, parser.hoja); parser.contador++; parser.hoja++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // EXPRESION ::= llave1 id llave2 
            {
              Nodo RESULT =null;
		int var1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int var1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT=new Nodo(null, null, var1, parser.contador, parser.hoja); parser.contador++; parser.hoja++;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // EXPRESION ::= error 
            {
              Nodo RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SEPARAR ::= separador separador separador separador 
            {
              Object RESULT =null;
		System.out.println("fin cabeza");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("SEPARAR",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // CUERPO ::= CUERPO ELEMENTOCUERPO 
            {
              Object RESULT =null;
		System.out.println("Expresiones aceptada");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // CUERPO ::= ELEMENTOCUERPO 
            {
              Object RESULT =null;
		System.out.println("Expresiones aceptada");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // CUERPO ::= error puntocoma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("CUERPO",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // ELEMENTOCUERPO ::= id dospuntos cadena puntocoma 
            {
              Object RESULT =null;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ELEMENTOCUERPO",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
