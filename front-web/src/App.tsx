import { useEffect } from 'react';
import './App.css';
import Home from './home';
import Navbar from './Navbar/index'

function App() {

  useEffect(() => {
    console.log("componente iniciou");
  }, [])

  return (
    <>
      <Navbar />
      <Home />
    </>
  );
}

export default App;
