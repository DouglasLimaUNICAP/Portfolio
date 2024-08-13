import React from 'react';

function MeuComponente() {
    return (
        <div style={{ 
            margin: '20px', 
            textAlign: 'center', 
            fontFamily: 'Arial, sans-serif',
            backgroundColor: '#f0f8ff',  
            padding: '20px',             
            borderRadius: '15px',        
            boxShadow: '0px 4px 8px rgba(0, 0, 0, 0.1)'             
          }}>
            <h1>
                Este é o meu exercício do: "Estudo Dirigido: criando uma primeira aplicação React"
            </h1>
            <hr />
            <img 
             src='/minhaimagem.png'
             alt='E-book'
             style={{marginBottom: '10px', 
                maxWidth: '150px', 
                borderRadius: '10px'}} 
            />
            <p style={{ 
        fontSize: '18px', 
        color: '#333', 
        fontWeight: 'bold' 
      }}>
                Esse é o meu componente!
            </p>

            <img 
             src='/minhaimagem2.png'
             alt='E-book'
             style={{marginBottom: '10px', 
                maxWidth: '150px', 
                borderRadius: '10px'}} 
            />
            <p style={{ 
        fontSize: '18px', 
        color: '#333', 
        fontWeight: 'bold' 
      }}>
                Esse é o meu componente número 02!
            </p>

            <img 
             src='/minhaimagem3.png'
             alt='E-book'
             style={{marginBottom: '10px', 
                maxWidth: '150px', 
                borderRadius: '10px'}} 
            />
            <p style={{ 
        fontSize: '18px', 
        color: '#333', 
        fontWeight: 'bold' 
      }}>
                Esse é o meu componente número 03!
            </p>
        </div>
    )
}

export default MeuComponente;