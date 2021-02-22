import logo from './logo.svg';
import './App.css';
import UserContainer from './containers/UserContainer';

function App() {
  return (
    <div className="App">
      <table>
        <thead>
          <tr>
            <td><UserContainer/></td>
            <td></td>
            <td></td>
          </tr>
        </thead>
      </table>
      
    </div>
  );
}

export default App;
