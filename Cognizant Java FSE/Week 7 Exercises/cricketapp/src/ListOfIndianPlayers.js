export function ListOfIndianPlayers({ IndianPlayers }) {
    return (
      <div>
        {IndianPlayers.map((item, idx) => (
          <li key={idx}>Mr. {item}</li>
        ))}
      </div>
    );
  }
  