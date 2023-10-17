import * as React from 'react';

import { StyleSheet, View, Text } from 'react-native';
import {
  showOverKeyguard,
  clearShowOverKeyguard,
} from 'react-native-bypass-keyguard';

export default function App() {
  React.useEffect(() => {
    console.log('REACHHINGGGGGGGGGG');
    showOverKeyguard();
    return () => {
      console.log('UNMOUNTTTTTTTTTTTTT');
      clearShowOverKeyguard();
    };
  }, []);

  return (
    <View style={styles.container}>
      <Text>Testing Application</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
