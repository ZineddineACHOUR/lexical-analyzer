package analyseurlex;

import java.util.ArrayList;

public class Lexical {
	/*-----------------------------------------------------------------*/
	/*    					-	Declarations	-				       */
	/*-----------------------------------------------------------------*/
	
	ArrayList<String> Token = new ArrayList<String>();
	ArrayList<String> Type = new ArrayList<String>();
	
	char C;
	int i;
	int Ec;
	int Cc;
	int Taille;
	boolean bool_1;
	boolean bool;
	String ch="";	
	
	int Nbr_Err=0;
	int Ligne_Err=0;
	int Col_Err;
	char Err_cara;
	boolean Err;	
	
	/*-----------------------------------------------------------------*/
	/*    			       -	Fin Declarations	-			       */
	/*-----------------------------------------------------------------*/
	
	int Indice_char(char a){
		if ((a>=65 && a<=90)||(a>=97 && a<=122)) return 0;          
		else
		 if (Character.isDigit(a)) return 1;
		 else
		  if(a=='.') return 2;
		  else
		   if ((a=='+')||(a=='-')||(a=='<')||(a=='>')||(a=='!')||(a=='%')) return 3;
		   else
			if(a=='=') return 4;
			else
			 if(a=='*') return 5;
			 else
			  if(a=='/') return 6;
			  else
			   if((a=='{')||(a=='}')||(a==';')||(a==':')||(a=='[')||(a==']')||(a==',')||(a=='(')||(a==')')||(a==39)||(a=='#')) return 7;
			   else
				if(a=='&') return 8;
				else
				 if(a=='|') return 9;
				 else
				  if(a=='_') return 10;
				  else
				   if (a=='"') return 11;
				   else 
					if (a==' ') return 12;
					else return 13;
	}
	
	boolean Mot_cle(String str){
		String Tab[]= new String[] {"void","int","float","char","return","if",
                "else","while","for","do","switch","goto","struct","typedef","include"};
		
		for(int i=0;i<15;i++)
			if (Tab[i].equals(str)) return true;
				
		return false;		
	}
	
	String Erreur_pack(boolean Err, char c, int b){
		
		if (Err) return "  ==> Caractére '" + c + "' innéxistant, position : " + b ;
		else return "";
	}
	
	void Add_Token(){
		if (bool==false) Ec=-1;
			
		if (ch!=""){
			Token.add(ch);
			if (Type_token(Ec,ch)=="Erreur"){
				Nbr_Err = Nbr_Err + 1;
				Type.add(Type_token(Ec,ch) + Erreur_pack(Err,Err_cara,Col_Err));
			}
			else
				Type.add(Type_token(Ec,ch));			
		}
		ch="";
		Ec=0;
		bool=true;
		bool_1=true;
		Err=false;
	}
	
	int Indice_separ(char a){
		if (a==' '||a=='\n'||a=='\t') return 0;
		else
			if (a=='(' ||a==')' ||a=='[' ||a==']' ||a=='{' ||a=='}'||a==':' || a==',' ||a==';' || a=='#' ||a==39) return 1;
			else
				if (a=='=' ||a=='+' ||a=='-' ||a=='*' ||a=='/' || a=='!'||a=='<' || a=='>'||a=='&' || a=='|' || a=='%')return 2;
				else if (a=='"') return 3;
					 else return -1;
	}
	
	String Type_token(int etat,String str){		
		if(etat==1)
		{
			if (Mot_cle(str)) 
				return "Mot clé";
			else
				return "Identificateur";
		}
		else
		{
			switch(etat)
			{
			case 2:return "Nombre entier";
			case 4:return "Nombre réel";
			case 5:return "Opérateur arithmétique";
			case 6:return "Opérateur arithmétique";
			case 7:return "Séparateur";
			case 8:return "Opérateur logique";
			case 9:return "Opérateur logique";
			case 10:return "Opérateur logique";
			case 11:return "Opérateur logique";
			case 12:return "Opérateur arithmétique";
			case 15:return "Commentaire";
			case 17:return "Chaine de caract�re";
			default:return "Erreur";
			}
		}
	}
	
	void Verifier(String ligne){
		int Tab_tran[][] = new int[18][14];
		//-------------------------
		for(int i=0;i<18;i++)
			for(int j=0;j<14;j++)
				Tab_tran[i][j]=-1;
			
		Tab_tran[0][0]=1;	
		Tab_tran[0][1]=2;		
		Tab_tran[0][3]=5;
		Tab_tran[0][4]=5;
		Tab_tran[0][5]=5;		
		Tab_tran[0][6]=12;		
		Tab_tran[0][7]=7;		
		Tab_tran[0][8]=8;		
		Tab_tran[0][9]=10;
		Tab_tran[0][11]=16;
		Tab_tran[1][0]=1;	
		Tab_tran[1][1]=1;
		Tab_tran[1][10]=1;
		Tab_tran[2][1]=2;		
		Tab_tran[2][2]=3;		
		Tab_tran[3][1]=4;
		Tab_tran[4][1]=4;
		Tab_tran[5][4]=6;		
		Tab_tran[8][8]=9;		
		Tab_tran[10][9]=11;	
		Tab_tran[12][4]=6;		
		Tab_tran[12][5]=13;
		
		for(int i=0;i<=13;i++)		
		Tab_tran[13][i]=13;
		
		Tab_tran[13][5]=14;		
		Tab_tran[14][6]=15;
		
		for (int i=0;i<=13;i++)
			Tab_tran[16][i]=16;
		
		Tab_tran[16][11]=17;
				
		Ec=0;
		Err=false;
		Taille=ligne.length();
		bool_1 = true;
		bool=true;
		ch="";
			
		for (i=0;i<Taille;i++){	
			C=ligne.charAt(i);
			Cc = Indice_char(C);
						
			if (bool_1)
				if ((Tab_tran[Ec][Cc]==-1 || Indice_separ(C)!=-1) && Ec!=16 && Ec!=13)
					bool_1=false;
			
			if (Err==false && bool_1==false){
				Err=true;
				Err_cara=C;
				Col_Err=i+1;				
			}
			
			if ((Ec==16 && C=='"')||(Ec==14 && C=='/')){
				ch=ch+C;
				Ec=Tab_tran[Ec][Cc];
				Add_Token();				
			}
			else{		
				if (bool_1==false && Indice_separ(C)!=-1){
					Add_Token();
				
					if (Indice_separ(C)==1){
						Ec=7;
						ch=ch+C;	
						Add_Token();					
					}
			
					if (Indice_separ(C)==2){
						if (i==Taille-1){
							Ec=Tab_tran[Ec][Cc];
							ch=ch+C;
							Add_Token();
						}
						if (i<Taille-1){
							ch=ch+C;
							Ec=Tab_tran[Ec][Cc];
							C=ligne.charAt(i+1);
							if (Indice_separ(C)==3) i+=1;
							Cc = Indice_char(C);
							if (Tab_tran[Ec][Cc]==-1){
								Add_Token();							
							}
							else{
								i=i+1;
								Ec=Tab_tran[Ec][Cc];
								ch=ch+C;
								if (ligne.charAt(i-1)=='/' && C=='*'){
									bool_1=true;
									bool=true;								
								}
								else	
									Add_Token();
							}
						}					
					}
					if (Indice_separ(C)==3){
						Ec=Tab_tran[Ec][Cc];
						ch=ch+C;
						bool=true;
						bool_1=true;					
					}
				}
				else{
					if (bool_1 && C!=' '){
						Ec=Tab_tran[Ec][Cc];					
					}				
					ch = ch + C;	
				}
			}
			bool=bool_1;
		}
					
		Add_Token();		
	}
	
	public String [] getArray(){		
		String [] a = new String [Token.size()];
		
		if(haveErrors()==0)
			for (int j=0;j<Token.size();j++){
				if(Type.get(j).compareTo("Commentaire")!=0){
					String tmp = Type.get(j);
					if (tmp=="Nombre entier" || tmp=="Nombre r�el" || tmp=="Identificateur"){				
						String type="";
						
						if (tmp == "Nombre entier") type="int";
						if (tmp == "Nombre r�el") type="float";
						if (tmp == "Identificateur") type="id";
						
						a[j]=type;
					}
					else
						a[j]=Token.get(j);
				}
			}		
		
		return a;
	}
	
	public int haveErrors(){
		if (Token.size()==0)
			return -1;
		else			
			if(Token.size()>0 && Nbr_Err==0)
				return 0;
			else
				return 1;
	}



}
