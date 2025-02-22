#include <iostream>
 
using namespace std;
 
int main() {
	float alunos[10][4], media=0;
	int contador=0;
   for(int lin=0; lin < 10; lin++){
   		cout << "Informe o RA do aluno: " << lin;
   		cin >> alunos[lin][0];
   		cout << "Informe a primeira nota do aluno:  ";
   		cin >> alunos[lin][1];
   		cout << "Informe a segunda nota do aluno:  ";
   		cin >> alunos[lin][2];
   		cout << "Informe a terceira nota do aluno:  ";
   		cin >> alunos[lin][3];
        media = (alunos[lin][1] + alunos[lin][2] + alunos[lin][3]) /3; 
   		if (media >=5){
   			contador++;
		   }	
   }	 

 
	
	return 0;
}