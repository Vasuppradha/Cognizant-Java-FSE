import React from 'react';
import { ListOfPlayers } from './ListOfPlayers';
import { ScoreBelow70 } from './ScoreBelow70';
import { OddPlayers } from './OddPlayers';
import { EvenPlayers } from './EvenPlayers';
import { ListOfIndianPlayers } from './ListOfIndianPlayers';

export default function App() {
  const flag = true;

  const players = [
    { name: 'Jack', score: 50 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 40 },
    { name: 'Ainn', score: 61 },
    { name: 'Elisabeth', score: 61 },
    { name: 'Jadeja', score: 64 },
    { name: 'Tendulkar', score: 100 },
    { name: 'Dravid', score: 85 },
    { name: 'Kohli', score: 95 },
    { name: 'Dhoni', score: 88 },
    { name: 'Raina', score: 73 },
  ];

  const T20Players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  const IndianTeam = {
    first: 'Sachin1',
    third: 'Virat3',
    fifth: 'Yuvraj5',
    second: 'Dhoni2',
    fourth: 'Rohit4',
    sixth: 'Raina6'
  };

  return (
    <div>
      {flag ? (
        <div>
          <h1>List of All Players</h1>
          <ListOfPlayers players={players} />
          <hr />
          <h1>Players with Score ≤ 70</h1>
          <ScoreBelow70 players={players} />
        </div>
      ) : (
        <div>
          <h1>Indian Team</h1>
          <h2>Odd Players</h2>
          <OddPlayers {...IndianTeam} />
          <hr />
          <h2>Even Players</h2>
          <EvenPlayers {...IndianTeam} />
          <hr />
          <h2>Merged Indian Players</h2>
          <ListOfIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      )}
    </div>
  );
}
