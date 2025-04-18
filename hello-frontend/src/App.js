import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch('http://18.116.38.222:8080/api/users')
      .then(res => res.json())
      .then(data => setUsers(data));
  }, []);

  return (
    <div>
      <h1>Hello World</h1>
      <h2>Users:</h2>
      <ul>
        {users.map(u => <li key={u.id}>{u.name}</li>)}
      </ul>
    </div>
  );
}

export default App;
