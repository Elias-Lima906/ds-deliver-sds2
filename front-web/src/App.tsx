import { useEffect } from 'react';
import './App.css';
import Navbar from './Navbar/index'

function App() {

  useEffect(() => {
    console.log("componente iniciou");
  }, [])

  return (
    <div>
      <Navbar />
    </div>
  );
}

export default App;
