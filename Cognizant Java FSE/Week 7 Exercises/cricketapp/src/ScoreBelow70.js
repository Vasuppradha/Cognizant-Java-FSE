export function ScoreBelow70({ players }) {
    const filtered = players.filter(item => item.score <= 70);
    return (
      <div>
        {filtered.map((item, idx) => (
          <li key={idx}>Mr. {item.name} <span>{item.score}</span></li>
        ))}
      </div>
    );
  }
  