function Panel(styleProps) {

    console.log(styleProps);

    return <>
        <div id="panel" style={{
            height: styleProps.panel.height
        }}>panel</div>
    </>
}

export default Panel