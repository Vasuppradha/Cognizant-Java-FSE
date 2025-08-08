export function ListOfPlayers({ players }) {
    return (
      <div>
        {players.map((item, idx) => (
          <li key={idx}>Mr. {item.name} <span>{item.score}</span></li>
        ))}
      </div>
    );
  }
  