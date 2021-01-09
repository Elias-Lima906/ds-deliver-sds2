import { useEffect } from 'react';
import './App.css';
import Routes from './routes';

function App() {

  useEffect(() => {
    console.log("componente iniciou");
  }, [])

  return (
      <Routes />
  );
}

export default App;
