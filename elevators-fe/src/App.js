import logo from './logo.svg';
import './App.css';
import React, {useState, useLayoutEffect} from 'react';
import Panel from "./components/ui/Panel";
import Controls from "./components/ui/Controls";
import Building from "./components/building/Building";

function App() {

    const controlsWidth = 300;
    const panelHeight = 30;

    const [style, setStyle] = useState({
        panel: {height: 0},
        controls: {width: 0, height: 0},
        building: {width: 0, height: 0}
    });

    useLayoutEffect(() => {
        function handleResize() {
            let width = window.innerWidth, height = window.innerHeight;
            let calculatedStyle = {
                panel: {
                    height: panelHeight
                }
            }
            calculatedStyle = {
                ...calculatedStyle, controls: {
                    height: height - calculatedStyle.panel.height,
                    width: controlsWidth,
                    top: calculatedStyle.panel.height
                }
            }
            calculatedStyle = {
                ...calculatedStyle,
                building: {
                    width: width - calculatedStyle.controls.width,
                    height: height - calculatedStyle.panel.height,
                    top: calculatedStyle.panel.height
                }
            }
            setStyle(calculatedStyle);
        }

        window.addEventListener('resize', handleResize);
        handleResize();
        return () => window.removeEventListener('resize', handleResize);
    }, []);

    return <>
        <Panel {...style}/>
        <Controls {...style}/>
        <Building {...style}/>
    </>
}

export default App;
